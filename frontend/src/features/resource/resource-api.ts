import { URL_RESOURCES } from "../../configuration/endpoint";
import type { Resource } from "../models/resource.model";

// récupère toutes les ressources
export async function getResources(): Promise<Resource[]> {
    return fetch(URL_RESOURCES)
        .then(response => response.json())
}

// récupère une ressource en fonction de son id
export async function getResourcesById(id: string): Promise<Resource> {
    const url = `${URL_RESOURCES}/${id}`;
    return fetch(url)
        .then(response => response.json())
}

//  post une nouvelle ressource
export async function postResource(formData: object): Promise<Resource> {
    const options = {
        method: "POST",
        body: JSON.stringify(formData)
    }

    const response = await fetch(URL_RESOURCES, options);
    return await response.json();
}