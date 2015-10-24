package org.swtk.commons.dict.wiktionary.generated.s.k.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionarySKU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("skul", "{\"term\":\"skul\", \"etymology\":{\"influencers\":[], \"languages\":[\"dalmatian\", \"Latin\"], \"text\":\"From Latin {{m|la|axilla}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"schoo\", \"priority\":1}]}, \"synonyms\":{}}");

	add("skulk", "{\"term\":\"skulk\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\"], \"text\":\"From Middle English skulken, of origin, compare Danish \u0027skulke\u0027 (shirk)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A group of foxes\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who skulks; a skulker. \u0026lt;!--Webster 1913--\u0026gt\", \"priority\":2}]}, \"synonyms\":{}}");

	add("skulduggery", "{\"term\":\"skulduggery\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"1856, apparently an alteration of Scottish English \u0027sculdudrie\u0027 (lang\u003den) \u0027sculduddery\u0027 “bawdry, obscenity”, a euphemism of uncertain origin.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A devious device or trick\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Underhanded or unscrupulous behavior\", \"priority\":2}]}, \"synonyms\":{}}");

	add("skullcap", "{\"term\":\"skullcap\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|skull|cap|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small domed cap that covers from the forehead to just above the back of the neck\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A yarmulke-like hat worn as an element of ghetto fashion\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of several species of flowering plants, of the genus \u0027Scutellaria\u0027, in the Lamiaceae family\", \"priority\":3}]}, \"synonyms\":{}}");

	add("skullet", "{\"term\":\"skullet\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|skull|mullet|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A more extreme form of the hairstyle, in which the hair at the back is kept long, whilst the hair on the top and the sides is shaven in a or style\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2010\u0027\u0027, Chad Gibbs, \u0027God \u0026amp; Football: Faith and Fanaticism in the w:Southeastern SEC\u0027, [http://books.google.co.uk/books?id\u003dqxYxrpUdi5kC\u0026amp;pg\u003dPT131\u0026amp;dq\u003dskullet\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dCxD4UI67LMqJ0AXHp4GQAg\u0026amp;ved\u003d0CDwQ6AEwAg page № unknown\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"John was, thankfully, no longer sporting the \u0027\u0027skullet\u0027\u0027 from his Facebook profile.\u0026lt;br/\u0026gt;“So what was the deal with that?” I asked.\u0026lt;br/\u0026gt;John just laughed. “It was a contest Christian Student Fellowship put on last year to see who could grow the best mullet. I won.”\u0026lt;br/\u0026gt;“I’m sure.”\u0026lt;br/\u0026gt;“And then when we left for our mission trip to Africa, I had to take it up a notch, so I went for the \u0027\u0027skullet\u0027\u0027.”\u0026lt;br/\u0026gt;\u0027How beautiful is the \u0027\u0027skullet\u0027\u0027 of him who brings good news\", \"priority\":3}]}, \"synonyms\":{}}");

	add("skunkweed", "{\"term\":\"skunkweed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|skunk|weed|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several American plants that have an offensive odour, but especially and\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"strong-smelling cannabis\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }