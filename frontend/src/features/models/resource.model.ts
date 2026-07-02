import type { Category } from "./category.model"
import type { ResourceStatus } from "./ResourceStatus.enum"
import type { ResourceType } from "./resourceType.enum"


export interface Resource {
    id: string
    title: string
    description: string
    url: string
    type: ResourceType
    status: ResourceStatus
    createdAT: string
    category: Category
}