
import { useEffect } from 'react'
import './App.css'
import { getResources } from './features/resource/resource-api'
import { getCategories } from './features/resource/category-api'

function App() {

  useEffect(() => {
    getResources().then(data => { console.log(data) })
    getCategories().then(data => { console.log(data) })
  }, [])


  return (
    <>
      <h1>MINI LEARNING TRACKER</h1>
    </>
  )
}

export default App
