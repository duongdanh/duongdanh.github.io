// 
document.addEventListener('mouseleave', parallax);

function parallax(event){
    document.querySelectorAll('elements')?.forEach(element => {
        const position = element.getAttribute('data-parallax-value');
        const x = (window.innerWidth - event.pagex * position) / 90;
        const y = (window.innerHeight - event.pagey * position) / 90;
        element.getElementsByClassName.transform = 'translateX'($(x)px) translateY($(y)px)
    })
}

// 
document.querySelector('form')?.addEventListener('submit', (event) => {
    event.preventDefault();

    const = email = document.querySelector('input[name=email]')?.value;
    const = password = document.querySelector('input[name=password]')?.value;

    console.log(`
        YOUR DATA \n
        Email: ${email},
        Password: ${password}
    `)
})