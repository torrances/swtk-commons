package org.swtk.commons.dict.wordnet.index.name.instance.p.n.e.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePNEU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pneumatics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06122777\"]}");
	add("{\"term\":\"pneumatophore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13146641\"]}");
	add("{\"term\":\"pneumococcus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01383395\"]}");
	add("{\"term\":\"pneumoconiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14173445\"]}");
	add("{\"term\":\"pneumocytosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14172772\"]}");
	add("{\"term\":\"pneumoencephalogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03290641\"]}");
	add("{\"term\":\"pneumogastric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05487728\"]}");
	add("{\"term\":\"pneumonectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00688388\"]}");
	add("{\"term\":\"pneumonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14171109\"]}");
	add("{\"term\":\"pneumonitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14377400\"]}");
	add("{\"term\":\"pneumonoconiosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14173445\"]}");
	add("{\"term\":\"pneumothorax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14173018\"]}");
	add("{\"term\":\"pneumovax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03978129\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }