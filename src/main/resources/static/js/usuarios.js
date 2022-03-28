$(document).ready(function() {
    cargarUsuarios();
  $('#usuarios').DataTable();
});

    async function cargarUsuarios(){
    const request = await fetch('usuarios', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    })
        .then(res => res.json())
        .then(usuarios => console.log(usuarios))
        .catch(error => console.log(error));
}