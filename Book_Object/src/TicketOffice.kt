class TicketOffice(
    private var amount: Long,
    private val tickets: MutableList<Ticket> = mutableListOf<Ticket>()
) {
    fun getTicket(): Ticket {
        return tickets.removeAt(0)
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAMount(amount: Long) {
        this.amount += amount
    }
}

