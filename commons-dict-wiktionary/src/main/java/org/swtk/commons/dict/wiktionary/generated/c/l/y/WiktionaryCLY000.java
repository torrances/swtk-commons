package org.swtk.commons.dict.wiktionary.generated.c.l.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryCLY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("clymene", "{\"term\":\"clymene\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027κλυμένη\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A nymph married to Iapetus, mother of Prometheus, Epimetheus, Menoetius and Atlas\", \"priority\":1}]}, \"synonyms\":{}}");

	add("clypeus", "{\"term\":\"clypeus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027clipeus\u0027 ‘round shield’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The shield-shaped front part of an insect\u0027s head or a spider\u0027s cephalothorax\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027: Cuisinart stuck a human eyelash to his \u0027\u0027clypeus\u0027\u0027 with saliva, twisted it into a handlebar mustache, and greeted citizens as they arrived at the rim of the sink. — Daniel Evan Weiss, \u0027The Roaches Have No King\u0027 (Serpent\u0027s Tail 2001, p.16\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027: When viewed from the front, the part of the carapace between the anterior eyes and the front edge of the carapace is called the \u0027\u0027clypeus\u0027\u0027. — Michael J. Roberts, \u0027Spiders of Britain and Northern Europe\u0027 (Collins 1996, p. 14\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }