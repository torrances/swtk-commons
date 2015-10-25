package org.swtk.commons.dict.wiktionary.generated.m.a.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryMAY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("mayblossom", "{\"term\":\"mayblossom\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|may|blossom|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A species of flower-bearing hawthorn with edible berries, \u0027Crataegus monogyna\", \"priority\":1}]}, \"synonyms\":{}}");

	add("mayday", "{\"term\":\"mayday\", \"etymology\":{\"influencers\":[], \"languages\":[\"French\", \"multiple languages\"], \"text\":\"From French \u0027me\u0027 short for \u0027venez|venez m\u0027aider !\u0027 (come help me!)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An international distress signal used by shipping and aircraf\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, Clive Cussler, \u0027Valhalla Rising‎\u0027, page 4\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"quot;Odd that she hasn\u0027t sent out a \u0027\u0027Mayday\u0027\u0027.\u0026quot;\u0026lt;br/\u0026gt;\u0026quot;That is curious. Her radio must be disabled.\u0026quot\", \"priority\":3}]}, \"synonyms\":{}}");

	add("mayoress", "{\"term\":\"mayoress\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|mayor|ess|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The wife of a (male) mayor\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A female mayor\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1993\u0027\u0027, Ian S. Uys, \u0027Bushman soldiers, their alpha and omega\u0027, page 39\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The blonde \u0027\u0027mayoress\u0027\u0027 was apparently a member of the MPLA and there were indications that spies in the town were sending radio messages to the enemy. Life was monotonous and the troops took to fishing to supplement their rations\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"2002\u0027\u0027, Andy Lane, ‎Paul Simpson, \u0027The Bond Files: An Unofficial Guide\u0027 (ISBN 0753507129), page 276\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"With the Spanish port of Cadiz doubling for the Cuban capital Havana, its striking blonde Mayoress was offered a small role as a nurse, but she politely declined\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }