package org.swtk.commons.dict.wiktionary.generated.b.a.u;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBAU000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("baud", "{\"term\":\"baud\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"{{borrowing|fr|baud|lang\u003den}}. Named for French inventor w:Émile Baudot|Jean-Maurice-Émile Baudot (1845-1903).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rate defined as the number of signalling events per second in a data transmission\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Synonym for bps (bits per second), regardless of how many signalling events are necessary to signal each bit\", \"priority\":2}]}, \"synonyms\":{}}");

	add("bauble", "{\"term\":\"bauble\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0027baubel\u0027 (trinket, child\u0027s toy) most likely a reduplication of \u0027bel\u0027 ultimately from Latin \u0027bellus\u0027 (pretty)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cheap showy ornament piece of jewellery; a gewgaw\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A club or sceptre carried by a jester\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A small shiny spherical decoration, commonly put on Christmas trees\", \"priority\":3}]}, \"synonyms\":{}}");

	add("baulk", "{\"term\":\"baulk\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"See balk\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"In billiards, the area of the table lying behind the line from which the cue ball is initially shot, and from which a ball in hand must be played\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }