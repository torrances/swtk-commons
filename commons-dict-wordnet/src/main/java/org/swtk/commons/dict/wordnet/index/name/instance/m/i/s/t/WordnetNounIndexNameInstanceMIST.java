package org.swtk.commons.dict.wordnet.index.name.instance.m.i.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11503106\"]}");
	add("{\"term\":\"mistake\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06782183\", \"05904330\", \"00071785\"]}");
	add("{\"term\":\"mistaking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07189084\"]}");
	add("{\"term\":\"mister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06352710\"]}");
	add("{\"term\":\"mistflower\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11976365\"]}");
	add("{\"term\":\"mistiming\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15205157\"]}");
	add("{\"term\":\"mistiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04711464\"]}");
	add("{\"term\":\"mistletoe\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"12758658\", \"12760092\", \"12760561\"]}");
	add("{\"term\":\"mistral\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11503273\"]}");
	add("{\"term\":\"mistranslation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06358492\"]}");
	add("{\"term\":\"mistreatment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00419038\"]}");
	add("{\"term\":\"mistress\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10343292\", \"10579268\", \"10343410\"]}");
	add("{\"term\":\"mistrial\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01201742\"]}");
	add("{\"term\":\"mistrust\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04902968\", \"05706756\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }