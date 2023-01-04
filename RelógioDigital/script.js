setInterval(horaAtual, 1000)

const relogio = document.querySelector('.relogio')

function horaAtual(){
    const horario =  new Date()
    const horas = formatarHorario(horario.getHours() ) 
    const minutos = formatarHorario(horario.getMinutes())
    const segundos = formatarHorario(horario.getSeconds()) 

    relogio.textContent = `${horas} : ${minutos} : ${segundos}`
}

function formatarHorario(tempo){
    if(tempo < 10){
        return '0' + tempo
    }
    return tempo
}
