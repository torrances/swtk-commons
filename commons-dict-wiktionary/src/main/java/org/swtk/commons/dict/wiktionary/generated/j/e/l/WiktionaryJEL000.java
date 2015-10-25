package org.swtk.commons.dict.wiktionary.generated.j.e.l;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryJEL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("jelq", "{\"term\":\"jelq\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"Arabic\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A penis enlargement technique in which the thumb and index finger are wrapped around the penis and repeatedly drawn away from the body in order to force blood into the glans and encourage vascularity\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jelick", "{\"term\":\"jelick\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Turkish\"], \"text\":\"From Turkish \u0027yelek\u0027 \u0026lt;ref\u0026gt;[http://www.merriam-webster.com/dictionary/jelick \u0026quot;jelick.\u0026quot;] \u0027Webster\u0027s Third New International Dictionary, Unabridged.\u0027 Merriam-Webster. 2002.\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The bodice of women or vest of men worn in the Ottoman Empire\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1819\u0027\u0027, Lord Byron, \u0027Don Juan\u0027, III.70\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"She wore two \u0027\u0027jelicks\u0027\u0027—one was of pale yellow; / Of azure, pink, and white was her chemise— / \u0027Neath which her breast heaved like a little billow\", \"priority\":3}]}, \"synonyms\":{}}");

	add("jello", "{\"term\":\"jello\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the brand name Jell-O.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A dessert made by boiling gelatin in water\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1968\u0027\u0027, w:Ronald Ronald Sukenick, \u0027Up\u0027, 1998 ed., ISBN 1573660450, page 26\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"And the food! I mean, I\u0027m not fussy, but couldn\u0027t they think of anything better than this toothpaste? A little \u0027\u0027Jello\u0027\u0027 or something, a nice can of soup\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1977\u0027\u0027, w:Florence Florence King, \u0027WASP, Where is Thy Sting?\u0027, excerpt, in \u0027The Florence King Reader\u0027, 1996 St. Martin\u0027s Press ed., ISBN 0312143370, page 25\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Alex Portnoy thought his mother had magical powers because she could suspend fruit in mid-\u0027\u0027Jello\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1984\u0027\u0027, William Martin, \u0027Nerve Endings\u0027, Crown, ISBN 0517550881, page 28\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"quot;I never eat \u0027\u0027Jello\u0027\u0027. I never eat anything that moves on the spoon.\u0026quot\", \"priority\":7}]}, \"synonyms\":{}}");

	add("jellycopter", "{\"term\":\"jellycopter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|jelly|helicopter|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a helicopte\", \"priority\":1}]}, \"synonyms\":{}}");

	add("jellyfish", "{\"term\":\"jellyfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|jelly|fish|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An almost transparent aquatic animal; any one of the acalephs, especially one of the larger species, having a jellylike appearance\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A cnidarian, a member of the phylum Cnidaria\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A scyphozoan, a member of the class Scyphozoa (the true true jellies\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A ctenophore, a member of the phylum Ctenophora (the comb comb jellies\", \"priority\":4}]}, \"synonyms\":{}}");

	add("jellygraph", "{\"term\":\"jellygraph\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|jelly|graph|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hectograph\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }