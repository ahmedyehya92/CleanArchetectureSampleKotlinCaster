package com.me.app.domain.repository

import com.me.app.domain.model.Project
import io.reactivex.Completable
import io.reactivex.Observable

interface ProjectRepository {
    fun getProjects(): Observable<List<Project>>
    fun bookmarkProject(projectId: String) : Completable
    fun unBookmarkProject(projectId: String) : Completable

    fun getBookmarkedProjects(): Observable<List<Project>>
}