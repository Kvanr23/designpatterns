class Engine:
    def __init__(self, is_inside):
        self.fail_chance = 0.001
        self.inside_engine = is_inside
        self.is_working = True
