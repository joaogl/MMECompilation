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

package me.joaogl.PigModels;

import me.joaogl.compilation.Main;
import me.joaogl.datamanagers.Files;
import me.joaogl.datamanagers.IdManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.potion.Potion;
import org.bukkit.util.Vector;

public class PigListener implements Listener {

    public static Main plugin;
    public static World world = Bukkit.getServer().getWorld("world");
    private String pig1 = " - Formula 27";
    private String pig1p = "1000";
    private double pig1pp = 1000;
    private String pig2 = " - Fiat Nisso";
    private String pig2p = "5000";
    private double pig2pp = 5000;
    private String pig3 = " - 3 Cavalos";
    private String pig3p = "10000";
    private double pig3pp = 10000;
    private String pig4 = " - Aston Veiron";
    private String pig4p = "20000";
    private double pig4pp = 20000;
    private String pig5 = " - Nissan Piggie";
    private String pig5p = "30000";
    private double pig5pp = 30000;
    private String pig6 = " - Jumping Pig";
    private String pig6p = "50000";
    private double pig6pp = 50000;

    public PigListener(Main instance) {
        plugin = instance;
    }

    @EventHandler
    public void onPigWalk(PlayerMoveEvent e) {
        final Player player = (Player) e.getPlayer();
        if (player.isInsideVehicle() && player.getLocation().getWorld().equals(world)) {
            if (player.getVehicle() instanceof Pig) {
                new Thread(new Runnable() {
                    public void run() {
                        Inventory inventory = player.getInventory();
                        for (ItemStack stack : inventory.getContents()) {
                            if (stack != null && stack.getType().equals(Material.WRITTEN_BOOK)) {
                                BookMeta im = (BookMeta) stack.getItemMeta();
                                if (im.getAuthor().equalsIgnoreCase("MME Authorities")) {
                                    Pig pig = (Pig) player.getVehicle();
                                    int Y = (int) pig.getLocation().getY();
                                    if (pig.getLocation().getY() == Y) {
                                        if (im.getTitle() != null) {
                                            if (im.getTitle().equalsIgnoreCase(player.getName() + pig1) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX(), pig.getVelocity().getY(), pig.getVelocity().getZ());
                                                pig.setVelocity(v);
                                            } else if (im.getTitle().equalsIgnoreCase(player.getName() + pig2) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX() + (pig.getVelocity().getX() / 4), pig.getVelocity().getY(), pig.getVelocity().getZ() + (pig.getVelocity().getZ() / 4));
                                                pig.setVelocity(v);
                                            } else if (im.getTitle().equalsIgnoreCase(player.getName() + pig3) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX() + (pig.getVelocity().getX() / 3), pig.getVelocity().getY(), pig.getVelocity().getZ() + (pig.getVelocity().getZ() / 3));
                                                pig.setVelocity(v);
                                            } else if (im.getTitle().equalsIgnoreCase(player.getName() + pig4) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX() + (pig.getVelocity().getX() / 2), pig.getVelocity().getY(), pig.getVelocity().getZ() + (pig.getVelocity().getZ() / 2));
                                                pig.setVelocity(v);
                                            } else if (im.getTitle().equalsIgnoreCase(player.getName() + pig5) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX() + pig.getVelocity().getX(), pig.getVelocity().getY(), pig.getVelocity().getZ() + pig.getVelocity().getZ());
                                                pig.setVelocity(v);
                                            } else if (im.getTitle().equalsIgnoreCase(player.getName() + pig6) && player.getItemInHand().getTypeId() == 398) {
                                                Vector v = new Vector(pig.getVelocity().getX() + (pig.getVelocity().getX() / 2), pig.getVelocity().getY() + 1.5, pig.getVelocity().getZ() + (pig.getVelocity().getZ() / 2));
                                                pig.setVelocity(v);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }).start();
            }
        }
    }

    @EventHandler
    public void onFall(EntityDamageEvent event) {
        Player player;
        if (event.getEntity() instanceof Pig && (player = (Player) event.getEntity().getPassenger()) != null) {
            Inventory inventory = player.getInventory();
            for (ItemStack stack : inventory.getContents()) {
                if (stack != null && stack.getType().equals(Material.WRITTEN_BOOK)) {
                    BookMeta im = (BookMeta) stack.getItemMeta();
                    if (im.getAuthor().equalsIgnoreCase("MME Authorities") && im.getTitle() != null && player.isInsideVehicle() && player.getLocation().getWorld().equals(world) & im.getTitle().equalsIgnoreCase(player.getName() + pig6)) event.setDamage(0);
                }
            }
        }

        if (event.getEntity() instanceof Player) {
            player = (Player) event.getEntity();
            Inventory inventory = player.getInventory();
            for (ItemStack stack : inventory.getContents()) {
                if (stack != null && stack.getType().equals(Material.WRITTEN_BOOK)) {
                    BookMeta im = (BookMeta) stack.getItemMeta();
                    if (im.getAuthor().equalsIgnoreCase("MME Authorities") && im.getTitle() != null && player.isInsideVehicle() && player.getLocation().getWorld().equals(world) && im.getTitle().equalsIgnoreCase(player.getName() + pig6)) event.setDamage(0);
                }
            }
        }
    }

    @EventHandler
    public void onAttack(EntityDamageByEntityEvent event) {
        EntityType defender = null;
        Player player;
        if (event.getDamager() instanceof Player && !(player = (Player) event.getDamager()).isOp()) {
            defender = event.getEntityType();
            if (event.getDamager().getWorld().equals(world) && defender.getTypeId() == 90) {
                Pig pig = (Pig) event.getEntity();
                boolean hassaddle = pig.hasSaddle();
                if (hassaddle) {
                    event.setDamage(0);
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage("Esse porco pertece a alguem...");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage("That Pig is own by some one...");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage("Das Schwein ist von jemandem eigenen...");
                    else Files.LangError(player);
                }
            }
        }

        if (event.getDamager() instanceof Arrow) {
            defender = event.getEntityType();
            if (event.getDamager().getWorld().equals(world) && defender.getTypeId() == 90) {
                Pig pig = (Pig) event.getEntity();
                boolean hassaddle = pig.hasSaddle();
                if (hassaddle) event.setDamage(0);
            }
        }

        if (event.getDamager() instanceof Potion) {
            defender = event.getEntityType();
            if (event.getDamager().getWorld().equals(world) && defender.getTypeId() == 90) {
                Pig pig = (Pig) event.getEntity();
                boolean hassaddle = pig.hasSaddle();
                if (hassaddle) event.setDamage(0);
            }
        }
    }

    @EventHandler
    public void onSignCreate(SignChangeEvent sign) {
        Player player = sign.getPlayer();
        if (player.isOp() && sign.getLine(0).equalsIgnoreCase("[pig]")) {
            if (sign.getLine(1).equalsIgnoreCase("1")) {
                sign.setLine(2, pig1);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig1p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else if (sign.getLine(1).equalsIgnoreCase("2")) {
                sign.setLine(2, pig2);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig2p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else if (sign.getLine(1).equalsIgnoreCase("3")) {
                sign.setLine(2, pig3);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig3p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else if (sign.getLine(1).equalsIgnoreCase("4")) {
                sign.setLine(2, pig4);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig4p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else if (sign.getLine(1).equalsIgnoreCase("5")) {
                sign.setLine(2, pig5);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig5p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else if (sign.getLine(1).equalsIgnoreCase("6")) {
                sign.setLine(2, pig6);
                sign.setLine(0, "Buy a Pig");
                sign.setLine(1, pig6p);
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Sucesso] Placa de venda de porcos criada.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Success] Sign was created.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Erfolg] Plaque zum Verkauf erstellt Schweinen.");
                else Files.LangError(player);
            } else {
                sign.setLine(0, "Pig Model");
                sign.setLine(1, "Not Found");
                sign.setLine(3, "Error");
                if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.GREEN + "[Erro] Este porco nao existe.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.GREEN + "[Error] That pig doesn't exists.");
                else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.GREEN + "[Fehler] Dieses Schwein existiert nicht.");
                else Files.LangError(player);
            }
        }
    }

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();
        if (!(block == null) && block.getType() == Material.SIGN_POST || !(block == null) && block.getType() == Material.WALL_SIGN) {
            Sign sign = (Sign) block.getState();
            Action action = event.getAction();
            if (action == Action.RIGHT_CLICK_BLOCK && sign.getLine(0).equalsIgnoreCase("Buy a Pig") && sign.getLine(2).equals(pig1)) {
                if (Main.econ.getBalance(player.getName()) >= pig1pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig1pp);
                    givePig(player, pig1);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            } else if (sign.getLine(2).equals(pig2)) {
                if (Main.econ.getBalance(player.getName()) >= pig2pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig2pp);
                    givePig(player, pig2);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            } else if (sign.getLine(2).equals(pig3)) {
                if (Main.econ.getBalance(player.getName()) >= pig3pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig3pp);
                    givePig(player, pig3);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            } else if (sign.getLine(2).equals(pig4)) {
                if (Main.econ.getBalance(player.getName()) >= pig4pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig4pp);
                    givePig(player, pig4);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            } else if (sign.getLine(2).equals(pig5)) {
                if (Main.econ.getBalance(player.getName()) > pig5pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig5pp);
                    givePig(player, pig5);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            } else if (sign.getLine(2).equals(pig6)) {
                if (Main.econ.getBalance(player.getName()) >= pig6pp) {
                    Main.econ.withdrawPlayer(player.getName(), pig6pp);
                    givePig(player, pig6);
                    player.updateInventory();
                } else {
                    if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Nao tem dinheiro suficiente.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You dont have enough money.");
                    else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] Sie haben nicht genug Geld.");
                    else Files.LangError(player);
                }
            }
        } else {

        }
    }

    @SuppressWarnings("deprecation")
    public static void givePig(Player player, String pigmodel) {
        ItemStack myBook = new ItemStack(Material.WRITTEN_BOOK);
        BookMeta im = (BookMeta) myBook.getItemMeta();
        im.setTitle(player.getName() + pigmodel);
        im.setAuthor("MME Authorities");
        im.addPage("English ............................1\nPortugues........................2\n........Deutsch...........................3\n\nEnglish:\n\n\nThis is what allow's\n you to have a different pig\n than the other's.");
        im.addPage("Portugues:\n\nIsto e o que te permite ter\num porco diferente\n...dos outros.\n\nDeutsch:\n\nDies und das ermoglicht\nes lhnen, ein  Schwien unterscheidet\nsich von anderen.");
        myBook.setItemMeta(im);
        player.getInventory().addItem(myBook);
        if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("pt")) player.sendMessage(ChatColor.RED + "[PORCO] Comprou um " + pigmodel);
        else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("en")) player.sendMessage(ChatColor.RED + "[PIG] You bought a " + pigmodel);
        else if (IdManager.getLang(IdManager.getId(player.getName())).equalsIgnoreCase("ger")) player.sendMessage(ChatColor.RED + "[Schwein] kaufte ein " + pigmodel);
        else Files.LangError(player);
        player.updateInventory();
    }
}