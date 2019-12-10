from .Engine import Engine
from .Flap import Flap
from .Pilot import Pilot


class Airplane:
    def __init__(self):
        # Plane can still fly if either one of the inside engines is still working.
        self.engine1 = Engine(False)
        self.engine2 = Engine(True)
        self.engine3 = Engine(True)
        self.engine4 = Engine(False)

        # Plane can still fly with 1 flap down.
        self.flap1 = Flap()
        self.flap2 = Flap()

        # Plane can still fly as long as one pilot is still working.
        self.pilot1 = Pilot()
        self.pilot2 = Pilot()
        self.pilot3 = Pilot()

        self.can_fly = True


