package com.wyb.github;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.wyb.github.bean.StarredRepo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoGithubApplication {

    static String[] STAR = {"curl", "-L", "-X", "PUT", "-H", "Accept: application/vnd.github+json", "-H", "Authorization: Bearer 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",
            "-H", "X-GitHub-Api-Version: 2022-11-28",
            "https://api.github.com/user/starred/%s"};


    static String[] cmdParts3 = {"curl", "--request", "GET", "--url", "-H", "https://api.github.com/octocat", "--header", "Authorization: Bearer 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"};

    public static final String TEMP = "curl -L \\\n" +
            "\t-X PUT \\\n" +
            "\t-H \"Accept: application/vnd.github+json\" \\\n" +
            "\t-H \"Authorization: Bearer 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\"\\\n" +
            "\t-H \"X-GitHub-Api-Version: 2022-11-28\" \\\n" +
            "\thttps://api.github.com/user/starred/%s";


    public static void main(String[] args) throws IOException {
        List<StarredRepo> userList = new ArrayList<>(120);
        FileReader fileReader = new FileReader("/Users/marcher/Downloads/marchnineteen-starred-page=1.json");
        userList.addAll(JSONUtil.toList(JSONUtil.parseArray(fileReader.readString()), StarredRepo.class));

        fileReader = new FileReader("/Users/marcher/Downloads/marchnineteen-starred-page=2.json");
        userList.addAll(JSONUtil.toList(JSONUtil.parseArray(fileReader.readString()), StarredRepo.class));

        fileReader = new FileReader("/Users/marcher/Downloads/marchnineteen-starred-page=3.json");
        userList.addAll(JSONUtil.toList(JSONUtil.parseArray(fileReader.readString()), StarredRepo.class));

        fileReader = new FileReader("/Users/marcher/Downloads/marchnineteen-starred-page=4.json");
        userList.addAll(JSONUtil.toList(JSONUtil.parseArray(fileReader.readString()), StarredRepo.class));

        userList.forEach(v -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            STAR[10] = String.format(STAR[10], v.getFullName());
            System.out.println(execCurl(STAR));
            STAR[10] = STAR[10].replace(v.getFullName(), "%s");
        });
    }


    public static String execCurl(String[] cmds) {
        ProcessBuilder process = new ProcessBuilder(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            return builder.toString();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
        return null;
    }
}
