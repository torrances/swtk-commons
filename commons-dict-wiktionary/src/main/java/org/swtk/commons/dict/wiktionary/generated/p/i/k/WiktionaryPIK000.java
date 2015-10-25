package org.swtk.commons.dict.wiktionary.generated.p.i.k;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPIK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pika", "{\"term\":\"pika\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several small, furry mammals, similar to guinea pigs, but related to rabbits, of the family Ochotonidae, from the mountains of North America and Asia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("piki", "{\"term\":\"piki\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"hopi\"], \"text\":\"Probably from Hopi\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A paper-thin, dry, rolled bread made by the Hopi with nixtamalized blue corn meal\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pikachurin", "{\"term\":\"pikachurin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Named after {{w|Pikachu}}, a {{w|Pokémon}} character, with suffix \u0027-in\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dystroglycan-interacting polysaccharide which has an essential role in the precise interactions between the photoreceptor ribbon synapse and the bipolar dendrites\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pikelet", "{\"term\":\"pikelet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A thick type of sweet pancake\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2005\u0027\u0027, Christine Manfield, Charlie Trotter (foreword), \u0027Spice: Recipes to Delight the Senses\u0027, Penguin Group Australia, republished 2008, Periplus, Singapore, %22pikelets%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dqwnYT8-WMamKmQWLkN2PAw\u0026amp;redir_esc\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"%22pikelets%22%20-intitle%3A%22%22%20-inauthor%3A%22%22\u0026amp;f\u003dfalse page 140\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"To cook the \u0027\u0027pikelets\u0027\u0027, heat a non-stick skillet and oil lightly, then pour the \u0027\u0027Pikelet\u0027\u0027 Mixture into 6 oiled egg rings. Cook over moderate heat until bubbles start to appear in the batter, then flip the \u0027\u0027pikelets\u0027\u0027 over and cook the other side, removing the egg rings as you do so\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, Jude Blereau, \u0027Wholefood: Heal... Nourish... Delight\u0027, Murdoch Books, Australia, %22pikelets%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dqwnYT8-WMamKmQWLkN2PAw\u0026amp;redir_esc\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"%22pikelets%22%20-intitle%3A%22%22%20-inauthor%3A%22%22\u0026amp;f\u003dfalse page 62\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"By soaking the batter overnight the grain is broken down, which results in a softer and more digestible pancake or \u0027\u0027pikelet\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"When made with wholemeal flours and low levels of fat, \u0027\u0027pikelets\u0027\u0027 and pancakes are much denser than traditional ones\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Jane Lawson, \u0027Grub: Favourite Food Memories\u0027, Murdoch Books, Australia, %22pikelets%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dqwnYT8-WMamKmQWLkN2PAw\u0026amp;redir_esc\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"%22pikelets%22%20-intitle%3A%22%22%20-inauthor%3A%22%22\u0026amp;f\u003dfalse page 23\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"To make the \u0027\u0027pikelets\u0027\u0027, sift the flour, sugar, and a pinch of salt into a bowl and make a well in the centre. Lightly whisk the eggs and milk together, then pour into the well. Whisk to a smooth batter and allow to rest for 15 minutes\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"A thin crumpet\", \"priority\":12}]}, \"synonyms\":{}}");

	add("pikeman", "{\"term\":\"pikeman\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|pike|man|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A soldier armed with a pike\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A person who operates a turnpike\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A miner who works with a pick\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }