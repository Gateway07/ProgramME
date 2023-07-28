from theory.Theory import Theory


class Path(Theory):
    """ Path class is sub theory for all SMT path: PathTheory(control_no, control_switch, X) -> (error, Y), where control_no is number of control element from specific program,
     control_switch - on/off to enable/disable transit of the tested path through required control. """

    def controls_size(self) -> int:
        """ Number of control elements (if/case/while/assert).  """
        pass
