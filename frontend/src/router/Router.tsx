
import ReactDOM from "react-dom/client";
import { BrowserRouter, Routes, Route } from "react-router";


import ResourcesPage from "../pages/ResourcesPage";
import ResourcePage from "../pages/ResourcePage";
import ResourceFormPage from "../pages/ResourceFormPage";
import CategoriesPage from "../pages/CategoriesPages";
import CategoryFormPage from "../pages/CategoryFormPage";

const root = document.getElementById("root");
if (!root) {
    throw new Error("l'element root n'a pas été trouvé")
}

ReactDOM.createRoot(root).render(
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<ResourcesPage />} />
            <Route path="/resources/:id" element={<ResourcePage />} />
            <Route path="/resources/new" element={<ResourceFormPage />} />
            <Route path="/categories" element={<CategoriesPage />} />
            <Route path="/categories/new" element={<CategoryFormPage />} />
        </Routes>
    </BrowserRouter>,
);
/*
const router = createBrowserRouter([
    {
        path: "/",
        element: <ResourcesPage />,
    },
    {
        path: "/resources/:id",
        loader: async ({ params }) => params.id,
        Component: ResourcePage,
    },
    {
        path: "/resources/new",
        element: <ResourceFormPage />,
    },
    {
        path: "/categories",
        element: <CategoriesPage />,
    },
    {
        path: "/categories/new",
        element: <CategoryFormPage />,
    },
]);

const root = document.getElementById("root");
if (!root) {
    throw new Error("l'element root n'a pas été trouvé")
}

ReactDOM.createRoot(root).render(
    <RouterProvider router={router} />,
);
*/