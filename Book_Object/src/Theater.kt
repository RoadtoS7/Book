class Theater(private val ticketSeller: TicketSeller) {
    fun enter(audience: Audience) {
        if(audience.bag.hasInvitation()) {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.ticket = ticket
        } else {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAMount(ticket.fee)
            audience.bag.ticket = ticket
        }
    }
}