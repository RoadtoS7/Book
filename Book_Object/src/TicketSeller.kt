class TicketSeller(private val ticketOffice: TicketOffice) {
    fun sellTo(audience: Audience) {
        val ticket = ticketOffice.getTicket()
        val amount = audience.buy(ticket)
        ticketOffice.plusAMount(amount)
    }
}

