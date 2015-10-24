package org.swtk.commons.dict.wiktionary.generated.d.a.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("davit", "{\"term\":\"davit\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A spar formerly used on board of ships, as a crane to hoist the flukes of the anchor to the top of the bow, without injuring the sides of the ship\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A crane, often working in pairs and usually made of steel, used to lower things over an edge of a long drop off, such as lowering a maintenance trapeze down a building or launching a lifeboat over the side of a ship. \u0026lt;!--source\u003den.wp!--\u0026gt\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1912\u0027\u0027, Morgan Robertson, \u0027s:The Wreck of the Titan: Or, The Wreck of the Titan: Or, Futility\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A solid, pyramid-like hummock of ice, left to starboard as the steamer ascended, and which projected close alongside the upper, or boat-deck, as she fell over, had caught, in succession, every pair of \u0027\u0027davits\u0027\u0027 to starboard, bending and wrenching them, smashing boats, and snapping tackles and gripes, until, as the ship cleared herself, it capped the pile of wreckage strewing the ice in front of, and around it, with the end and broken stanchions of the bridge\", \"priority\":4}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }