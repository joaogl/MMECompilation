/**
 * This file is part of MMECompilation.

    MMECompilation is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    MMECompilation is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with MMECompilation.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.joaogl.eventos;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;
import net.milkbowl.vault.economy.Economy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EventComandos {

    public Main plugin;
    public static int LocX;
    public static int LocY;
    public static int LocZ;
    public static int LocXs;
    public static int LocYs;
    public static int LocZs;
    public static int event = 0;
    public static int insOn = 0;
    public static int definido = 0;
    public static int premio = 0;
    public static Object evento = null;
    public static Object vencedor = null;
    public static World world = null;
    public static World worlds = Bukkit.getWorld("eventos");
    public Economy econ = null;
    public static String whatever;
    public int max = 0;
    public static int step = 0;

    public EventComandos(Main instance) {
        plugin = instance;
    }

    public static void Ajuda(Player player) {
        if (player.isOp() || player.hasPermission("event.comandos")) {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) {
                player.sendMessage(ChatColor.RED + "=================== Ajuda Eventos ====================");
                player.sendMessage(ChatColor.GREEN + "Primeiro os Admins devem definir o tipo de evento.");
                player.sendMessage(ChatColor.GREEN + "Usando o comando /e(vento).");
                player.sendMessage(ChatColor.GREEN + "Com isto feito devera fazer /an(nuncio).");
                player.sendMessage(ChatColor.GREEN + "Apos isto tudo estar pronto devera fazer /ab(rir)");
                player.sendMessage(ChatColor.GREEN + "Agora para fechar as inscricoes basta fazer /fe(char).");
                player.sendMessage(ChatColor.GREEN + "No caso do Spleef deve fazer /re(grasevento)");
                player.sendMessage(ChatColor.GREEN + "Depois fazer a contagem decrescente com /comecar.");
                player.sendMessage(ChatColor.GREEN + "No fim do evento fazer /ve(encedor) E /fim para acabar tudo.");
                player.sendMessage(ChatColor.RED + "=====================================================");
            } else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) {

            } else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) {

            } else Files.LangError(player);
        } else PermissionDeny(player);

    }

    public static void Step(Player player) {
        if (player.isOp() || player.hasPermission("event.step")) {
            if (step <= 4) step = step + 1;
            else step = 0;

            player.sendMessage(ChatColor.RED + "=================== Step Event ====================");
            player.sendMessage(ChatColor.GREEN + "Estamos na layer " + step);
            player.sendMessage(ChatColor.RED + "=====================================================");
        } else PermissionDeny(player);

    }

    public static void Evento(String[] args, Player player) {
        if (player.isOp() || player.hasPermission("event.evento")) {
            if (args.length >= 1) {
                if (args.length == 1) whatever = args[0];
                else if (args.length == 2) whatever = args[0] + " " + args[1];

                if (whatever.equalsIgnoreCase("Spleef")) {
                    premio = 50000;
                    LocX = (int) -707;
                    LocY = (int) 55;
                    LocZ = (int) 1421;
                    world = Bukkit.getServer().getWorld("eventos");
                    definido = 1;
                    evento = "Spleef";
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Spleef, premio de 50000 e Localizacao defenida.");
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Pronto a abrir nao precisa de defenir mais nada.");
                    RunEvent.Run(player, evento);
                } else if (whatever.equalsIgnoreCase("Arena PVP")) {
                    premio = 50000;
                    LocX = (int) -644;
                    LocY = (int) 2;
                    LocZ = (int) 1519;
                    world = Bukkit.getServer().getWorld("eventos");
                    definido = 1;
                    evento = "Arena PVP";
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Arena PVP, premio de 50000 e Localizacao defenida.");
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Pronto a abrir nao precisa de defenir mais nada.");
                    RunEvent.Run(player, evento);
                } else if (whatever.equalsIgnoreCase("Run")) {
                    premio = 50000;
                    LocX = (int) -864;
                    LocY = (int) 4;
                    LocZ = (int) 1556;
                    world = Bukkit.getServer().getWorld("eventos");
                    definido = 1;
                    evento = "Run";
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Run, premio de 50000 e Localizacao defenida.");
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Pronto a abrir nao precisa de defenir mais nada.");
                    RunEvent.Run(player, evento);
                } else if (whatever.equalsIgnoreCase("Parkur")) {
                    premio = 50000;
                    LocX = (int) -736;
                    LocY = (int) 4;
                    LocZ = (int) 1568;
                    world = Bukkit.getServer().getWorld("eventos");
                    definido = 1;
                    evento = "Parkur";
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Parkur, premio de 50000 e Localizacao defenida.");
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Pronto a abrir nao precisa de defenir mais nada.");
                    RunEvent.Run(player, evento);
                } else if (whatever.equalsIgnoreCase("Maratona")) {
                    premio = 50000;
                    LocX = (int) -800;
                    LocY = (int) 4;
                    LocZ = (int) 1550;
                    world = Bukkit.getServer().getWorld("eventos");
                    definido = 1;
                    evento = "Maratona";
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Maratona, premio de 50000 e Localizacao defenida.");
                    player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " Pronto a abrir nao precisa de defenir mais nada.");
                    RunEvent.Run(player, evento);
                } else player.sendMessage(ChatColor.RED + "[Evento] Evento desconhecido na lista das predefinicoes... Escreva /lista");
            } else {
                player.sendMessage(ChatColor.RED + "O numero de argumentos nao esta certo!");
                player.sendMessage(ChatColor.BLUE + "/evento <nome do evento>");
            }
        } else PermissionDeny(player);
    }

    public static void Premio(String[] args, Player player) {
        if (player.isOp() || player.hasPermission("event.premio")) {
            premio = Integer.parseInt(args[0]);
            if (args.length == 1) player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " O premio para o evento sera " + premio + "$ .");
            else {
                player.sendMessage(ChatColor.RED + "O numero de argumentos nao esta certo!");
                player.sendMessage(ChatColor.BLUE + "/premio <premio para o evento>");
            }
        } else PermissionDeny(player);
    }

    public static void Regras(String[] args, Player player) {
        if (player.isOp() || player.hasPermission("event.regras")) {
            if (args.length == 1) {
                whatever = args[0];
                if (whatever == "spleef") {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "_____________Regras para o Evento_____________");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "O jogador deve partir a neve para que os");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "outros jogadores caiam.");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "O ultimo a ficar vivo ganha.");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Nao se pode acampar.");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "Se ficares no ultimo piso tens 10 segundos");
                    Bukkit.getServer().broadcastMessage(ChatColor.GREEN + "para descer.");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "______________________________________________");
                } else {

                }
            } else {
                player.sendMessage(ChatColor.RED + "O numero de argumentos nao esta certo!");
                player.sendMessage(ChatColor.BLUE + "(/re)grasevento <nome do evento>");
            }
        } else PermissionDeny(player);
    }

    public static void An(Player player) {
        if (player.isOp() || player.hasPermission("event.anunciar")) {
            if (!(evento == null || premio == 0)) {
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + " " + ChatColor.BLUE + evento + ChatColor.GREEN + " event is caming up soon.");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Remove any item from your inventory otherwise you lose every thing ");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " Including armor!!!!!");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Event award: " + ChatColor.BLUE + premio + ChatColor.GREEN + "$!!");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
            } else player.sendMessage(ChatColor.RED + "Nao defeniu todas as variaveis!");
        } else PermissionDeny(player);
    }

    public static void Abrir(Player player) {
        if (player.isOp() || player.hasPermission("event.abrir")) {
            if (evento != null || premio != 0 || definido != 0) {
                if (insOn == 0) {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + " " + ChatColor.BLUE + evento + ChatColor.GREEN + " event is on. Type /go to enter.");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Remove any item from your inventory otherwise you");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " lose every thing.");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " Including armor!!!!!");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
                    if (!(insOn == 1)) insOn = 1;
                } else if (insOn == 1) {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + " " + ChatColor.BLUE + evento + ChatColor.GREEN + " event is on. Type /go to enter.");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Remove any item from your inventory otherwise you");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " lose every thing.");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " Including armor!!!!!");
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
                    if (!(insOn == 1)) insOn = 1;
                }
            } else {
                player.sendMessage(ChatColor.RED + "[Event] Nao defeniu todas as variaveis!");
                player.sendMessage(ChatColor.BLUE + "[Event] Por favor escreva " + ChatColor.BLUE + "/ae " + ChatColor.RED + "para ajuda!");
            }
        } else PermissionDeny(player);
    }

    public static void Definir(String[] args, Player player) {
        if (player.isOp() || player.hasPermission("event.definir")) {
            Location playerLoc = player.getLocation();
            LocX = (int) playerLoc.getX();
            LocY = (int) playerLoc.getY();
            LocZ = (int) playerLoc.getZ();
            world = player.getWorld();
            definido = 1;
            player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + "A localizacao do /ir foi definida!");
        } else PermissionDeny(player);
    }

    public static void irAction(Player player) {
        if (insOn == 1 && definido == 1) {
            if (IdManager.getEvent(IdManager.getId(player.getName())) == null) IdManager.setEvent(IdManager.getId(player.getName()), "none");
            if (IdManager.getEvent(IdManager.getId(player.getName())).equalsIgnoreCase("TRUE")) irDeny(player);
            else {
                IdManager.setEvent(IdManager.getId(player.getName()), "TRUE");
                if (evento.equals("spleef") || evento.equals("Spleef")) {
                    player.getInventory().clear();
                    setHealth(player);
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_SPADE, 1));
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 10));
                    irAccept(player);
                } else if (evento.equals("Arena PVP")) {
                    player.getInventory().clear();
                    setHealth(player);
                    player.getInventory().addItem(new ItemStack(Material.DIAMOND_SWORD, 1));
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 10));
                    player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
                    irAccept(player);
                } else if (evento.equals("Run")) {
                    player.getInventory().clear();
                    setHealth(player);
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 10));
                    irAccept(player);
                } else if (evento.equals("Maratona")) {
                    player.getInventory().clear();
                    setHealth(player);
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 10));
                    irAccept(player);
                } else if (evento.equals("Parkur")) {
                    player.getInventory().clear();
                    setHealth(player);
                    player.getInventory().addItem(new ItemStack(Material.APPLE, 10));
                    irAccept(player);
                }
            }
        } else {
            if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.RED + " Nao podes ir ao evento quando as inscricoes nao estao abertas!");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " The inscriptions are closed you can't go any more!");
            else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Das Schwein ist von jemandem eigenen...");
            else Files.LangError(player);
            player.sendMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " There is no event.");
        }
    }

    public static void setHealth(Player player) {
        player.setHealth(20);
        player.setFoodLevel(20);
    }

    public static void PermissionDeny(Player player) {
        player.sendMessage(ChatColor.RED + "Nao tem permissao para este comando.");
    }

    @SuppressWarnings("deprecation")
    public static void irDeny(Player player) {
        player.getInventory().clear();
        player.getInventory().setHelmet(new ItemStack(Material.AIR, 1));
        player.getInventory().setChestplate(new ItemStack(Material.AIR, 1));
        player.getInventory().setLeggings(new ItemStack(Material.AIR, 1));
        player.getInventory().setBoots(new ItemStack(Material.AIR, 1));
        player.setHealth(1);
        player.setFoodLevel(1);
        player.sendMessage("Ja estavas no evento!");
        player.sendMessage("You were allready in the event!");
        player.updateInventory();
    }

    @SuppressWarnings("deprecation")
    public static void irAccept(Player player) {
        Location loc = new Location(world, LocX, LocY, LocZ);
        player.teleport(loc);
        player.sendMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + "Bem-vindo ao Evento!");
        player.sendMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "Welcome to the Event!");
        player.getInventory().setHelmet(new ItemStack(Material.AIR, 1));
        player.getInventory().setChestplate(new ItemStack(Material.AIR, 1));
        player.getInventory().setLeggings(new ItemStack(Material.AIR, 1));
        player.getInventory().setBoots(new ItemStack(Material.AIR, 1));
        player.updateInventory();
    }

    public static void eventList(Player player) {
        if (player.isOp() || player.hasPermission("event.list")) {
            player.sendMessage(ChatColor.GREEN + "===== Lista de Comandos =====");
            player.sendMessage(ChatColor.GREEN + "Spleef");
            player.sendMessage(ChatColor.GREEN + "Run");
            player.sendMessage(ChatColor.GREEN + "Arena PVP");
            player.sendMessage(ChatColor.GREEN + "Maratona");
            player.sendMessage(ChatColor.GREEN + "Parkur");
            player.sendMessage(ChatColor.GREEN + "=========================");
        } else PermissionDeny(player);
    }

    public static void closeAction(Player player) {
        if (player.isOp() || player.hasPermission("event.fechar")) {
            if (insOn == 1) {
                insOn = 2;
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " The inscriptions are now closed.");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " You can't participate any more");
                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
            } else player.sendMessage(ChatColor.RED + "Inscricoes nao iniciadas!");
        } else PermissionDeny(player);
    }

    public static void startAction(Player player) {
        if (player.isOp() || player.hasPermission("event.comecar")) {
            if (insOn == 2 && event == 0) startEvent();
            else player.sendMessage(ChatColor.RED + "Ainda nao foram realizadas inscricoes ou ja foi iniciado um evento!");
        } else PermissionDeny(player);
    }

    public static void Winner(String[] args, Player player) {
        if (player.isOp() || player.hasPermission("event.vencedor")) {
            vencedor = args[0];
            if (args.length == 1) {
                boolean target = player.getServer().getPlayer((String) vencedor).isOnline();
                if (target) {
                    new Thread(new Runnable() {
                        public void run() {
                            try {
                                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
                                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Event is now Closed!");
                                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " And the winner is...");
                                Thread.sleep(1000);
                                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + " The winner is " + ChatColor.DARK_BLUE + vencedor + ChatColor.GREEN + " !!");
                                Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Evento]" + ChatColor.GREEN + "==============================================");
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();
                    if (premio >= 100) Main.econ.depositPlayer((String) vencedor, premio);
                    if (evento.equals("Spleef")) Spleef.SetLayers(39, 49, -681, 8, 1399, 0, 1);
                    event = 1;
                    insOn = 2;
                } else player.sendMessage("Esse player nao esta online.");
            } else {
                player.sendMessage(ChatColor.RED + "O numero de argumentos nao esta certo!");
                player.sendMessage(ChatColor.BLUE + "/ve(encedor) <nick do player que ganhou>");
            }
        } else PermissionDeny(player);
    }

    public static void endAction(Player player) {
        if (player.isOp() || player.hasPermission("event.fim")) {
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "=================== Event ====================");
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " With the end, is coming the lag for a bit.");
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + " Thank you all contestants.");
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.RED + " There be more next time.");
            Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
            new Thread(new Runnable() {
                public void run() {
                    if (evento.equals("Spleef")) {
                        Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event]" + ChatColor.GREEN + "==============================================");
                        Spleef.SetLayers(39, 49, -681, 43, 1399, 80, 6);
                    } else if (evento.equals("Arena PVP")) ArenaPVP.Blocks(true);
                }
            }).start();
            LocX = 0;
            LocY = 0;
            LocZ = 0;
            LocXs = 0;
            LocYs = 0;
            LocZs = 0;
            event = 0;
            insOn = 0;
            definido = 0;
            premio = 0;
            evento = null;
            vencedor = null;
            world = null;
            step = 0;
            IdManager.deleteEvent();
        } else PermissionDeny(player);
    }

    private static void startEvent() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "Starts in 15 Seconds");
                    Thread.sleep(10000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "Starts in 5 Seconds");
                    Thread.sleep(1000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "4 Seconds");
                    Thread.sleep(1000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "3 Seconds");
                    Thread.sleep(1000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "2 Seconds");
                    Thread.sleep(1000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "1 Seconds");
                    Thread.sleep(1000);
                    Bukkit.getServer().broadcastMessage(ChatColor.RED + "[Event] " + ChatColor.GREEN + "GO GO GO!!!");
                    if (evento.equals("Spleef")) {
                        step = 1;
                        Spleef.removeLayer();
                    } else if (evento.equals("Arena PVP")) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ArenaPVP.Blocks(false);
                            }
                        }).start();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
