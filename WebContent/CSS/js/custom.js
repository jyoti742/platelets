$(function() {
    $("#work").magnificPopup({
        delegate: 'a',
        type: 'image',
        gallery: { enabled: true }
    });

});
$(function() {
    $("#team-members").owlCarousel({
        items: 3,
        autoplay: true,
        smartSpeed: 400,
        loop: true
    });

});