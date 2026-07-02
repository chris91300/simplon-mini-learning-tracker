import { useParams } from "react-router";


export default function ResourcePage() {
    const params = useParams();
    const id = params.id;
    return <h1>détail d'une resource id: {id}</h1>
}