package com.wyb.github.bean;

import java.util.List;

/**
 * @author wangyingbo
 * @date 2023-05-05 15:55
 */
@lombok.NoArgsConstructor
@lombok.Data
public class StarredRepo {
    private Integer id;
    private String nodeId;
    private String name;
    private String fullName;
    private OwnerDTO owner;
    private Boolean privateX;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String url;
    private String archiveUrl;
    private String assigneesUrl;
    private String blobsUrl;
    private String branchesUrl;
    private String collaboratorsUrl;
    private String commentsUrl;
    private String commitsUrl;
    private String compareUrl;
    private String contentsUrl;
    private String contributorsUrl;
    private String deploymentsUrl;
    private String downloadsUrl;
    private String eventsUrl;
    private String forksUrl;
    private String gitCommitsUrl;
    private String gitRefsUrl;
    private String gitTagsUrl;
    private String gitUrl;
    private String issueCommentUrl;
    private String issueEventsUrl;
    private String issuesUrl;
    private String keysUrl;
    private String labelsUrl;
    private String languagesUrl;
    private String mergesUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String pullsUrl;
    private String releasesUrl;
    private String sshUrl;
    private String stargazersUrl;
    private String statusesUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String tagsUrl;
    private String teamsUrl;
    private String treesUrl;
    private String cloneUrl;
    private String mirrorUrl;
    private String hooksUrl;
    private String svnUrl;
    private String homepage;
    private Object language;
    private Integer forksCount;
    private Integer stargazersCount;
    private Integer watchersCount;
    private Integer size;
    private String defaultBranch;
    private Integer openIssuesCount;
    private Boolean isTemplate;
    private List<String> topics;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Boolean hasDownloads;
    private Boolean archived;
    private Boolean disabled;
    private String visibility;
    private String pushedAt;
    private String createdAt;
    private String updatedAt;
    private PermissionsDTO permissions;
    private Boolean allowRebaseMerge;
    private Object templateRepository;
    private String tempCloneToken;
    private Boolean allowSquashMerge;
    private Boolean allowAutoMerge;
    private Boolean deleteBranchOnMerge;
    private Boolean allowMergeCommit;
    private Integer subscribersCount;
    private Integer networkCount;
    private LicenseDTO license;
    private Integer forks;
    private Integer openIssues;
    private Integer watchers;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class OwnerDTO {
        private String login;
        private Integer id;
        private String nodeId;
        private String avatarUrl;
        private String gravatarId;
        private String url;
        private String htmlUrl;
        private String followersUrl;
        private String followingUrl;
        private String gistsUrl;
        private String starredUrl;
        private String subscriptionsUrl;
        private String organizationsUrl;
        private String reposUrl;
        private String eventsUrl;
        private String receivedEventsUrl;
        private String type;
        private Boolean siteAdmin;
    }

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class PermissionsDTO {
        private Boolean admin;
        private Boolean push;
        private Boolean pull;
    }

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class LicenseDTO {
        private String key;
        private String name;
        private String url;
        private String spdxId;
        private String nodeId;
        private String htmlUrl;
    }
}
