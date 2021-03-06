package org.netmelody.cieye.core.domain;

public abstract class Target {

    private final TargetId id;
    private final String webUrl;
    private final String name;
    private final Status status;

    public Target(String id, String webUrl, String name, Status status) {
        this(new TargetId(id), webUrl, name, status);
    }
    
    public Target(TargetId id, String webUrl, String name, Status status) {
        this.id = id;
        this.webUrl = webUrl;
        this.name = name;
        this.status = status;
    }

    public TargetId id() {
        return id;
    }

    public String name() {
        return name;
    }

    public Status status() {
        return status;
    }

    public String webUrl() {
        return webUrl;
    }
}