package org.swtk.commons.dict.wordnet.index.name.instance.s.t.r.u;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTRU {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"structuralism\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06177868\", \"06178050\", \"06191000\"]}");
	add("{\"term\":\"structure\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"08395550\", \"05232895\", \"05734290\", \"04939142\", \"04348764\"]}");
	add("{\"term\":\"strudel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07643302\"]}");
	add("{\"term\":\"struggle\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00623308\", \"00961007\", \"00790634\"]}");
	add("{\"term\":\"struggler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10684741\"]}");
	add("{\"term\":\"strum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07410720\"]}");
	add("{\"term\":\"struma\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14167729\", \"14222959\"]}");
	add("{\"term\":\"strumpet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09792353\"]}");
	add("{\"term\":\"strut\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04350226\", \"00290969\"]}");
	add("{\"term\":\"struthio\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01521359\"]}");
	add("{\"term\":\"struthiomimus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01718939\"]}");
	add("{\"term\":\"struthionidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01521205\"]}");
	add("{\"term\":\"struthioniformes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01520988\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }