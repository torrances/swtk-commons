package org.swtk.commons.dict.wordnet.index.name.instance.p.a.d.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePADD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"padda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01546149\"]}");
	add("{\"term\":\"padder\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10121899\"]}");
	add("{\"term\":\"padding\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03878742\"]}");
	add("{\"term\":\"paddle\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03879094\", \"03879252\", \"03879377\", \"03879526\"]}");
	add("{\"term\":\"paddlefish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02642235\"]}");
	add("{\"term\":\"paddler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09910922\"]}");
	add("{\"term\":\"paddlewheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03879971\"]}");
	add("{\"term\":\"paddock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03880165\"]}");
	add("{\"term\":\"paddy\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07820876\", \"08631804\", \"09734917\"]}");
	add("{\"term\":\"paddymelon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01881858\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }