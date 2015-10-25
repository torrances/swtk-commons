package org.swtk.commons.dict.wiktionary.generated.t.i.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTID000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tidbit", "{\"term\":\"tidbit\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A tasty morsel (of food\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A quarter of a byte (Half of a nybble; two bits\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A short mention of news or gossip (archaic\", \"priority\":3}]}, \"synonyms\":{}}");

	add("tiddlywinks", "{\"term\":\"tiddlywinks\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A game in which the objective is to shoot winks into a cup or at a target by flicking them with a shooter (nowadays called a squidger) from a surface\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A competitive partnership game in which the objective is to gain an advantage over opponents by squopping opponent winks and by squidging friendly winks into a pot\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tides", "{\"term\":\"tides\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"quot;Yet the \u0027\u0027tides\u0027\u0027 of war do not wait, and General Lee had come to the capital to try and shape their future course.\u0026quot; - [http://books.google.com/books?vid\u003dISBN0618485384\u0026amp;id\u003dnSnw3YPGN-0C\u0026amp;pg\u003dPA1\u0026amp;lpg\u003dPA1\u0026amp;dq\u003d%22tides+of+war%22\u0026amp;sig\u003dhL4OXMUcIxma5nAXSP7YuJaEQsQ] \u0027\u0027Stephen W Sears\u0027\u0027, 2004, \u0027\u0027Gettysburg\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tidepool", "{\"term\":\"tidepool\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From tide + pool\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"countable) a rocky pool by the ocean that is filled with seawater left behind by the falling tid\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"They peeked into the \u0027\u0027tidepool\u0027\u0027 and found starfish and anemones\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tidewrack", "{\"term\":\"tidewrack\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"seaweed and similar marine vegetation and rubbish deposited along a shore by a receding tide\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }