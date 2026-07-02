import { URL_CATEGORIES } from "../../configuration/endpoint";
import type { Category } from "../models/category.model";

// récupère toutes les categories
export async function getCategories(): Promise<Category[]> {
    return fetch(URL_CATEGORIES)
        .then(response => response.json())
}

//  post une nouvelle categorie
export async function postCategories(formData: object): Promise<Category> {
    const options = {
        method: "POST",
        body: JSON.stringify(formData)
    }

    const response = await fetch(URL_CATEGORIES, options);
    return await response.json();
}