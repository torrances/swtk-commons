package org.swtk.commons.dict.wordnet.index.name.instance.l.a.r.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceLARY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"laryngectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00684467\"]}");
	add("{\"term\":\"laryngismus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00228004\"]}");
	add("{\"term\":\"laryngitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372448\"]}");
	add("{\"term\":\"laryngopharyngitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372613\"]}");
	add("{\"term\":\"laryngopharynx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05536792\"]}");
	add("{\"term\":\"laryngoscope\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03648463\"]}");
	add("{\"term\":\"laryngospasm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14124439\"]}");
	add("{\"term\":\"laryngostenosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14130305\"]}");
	add("{\"term\":\"laryngotracheobronchitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14372716\"]}");
	add("{\"term\":\"larynx\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05537362\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }