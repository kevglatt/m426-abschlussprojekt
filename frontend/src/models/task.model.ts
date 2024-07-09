enum Priority {
    LOW = "LOW",
    MEDIUM = "MEDIUM",
    HIGH = "HIGH",
}

export interface TaskModel {
    id: number,
    title: string,
    description: string,
    completed: boolean,
    priority: Priority,
    due: Date,
    createdAt: Date,
    task?: TaskModel
}