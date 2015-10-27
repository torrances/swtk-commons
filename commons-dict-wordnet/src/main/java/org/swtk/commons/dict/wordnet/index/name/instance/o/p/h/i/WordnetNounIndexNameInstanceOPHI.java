package org.swtk.commons.dict.wordnet.index.name.instance.o.p.h.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOPHI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ophidia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01729031\"]}");
	add("{\"term\":\"ophidian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01729333\"]}");
	add("{\"term\":\"ophidiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02561355\"]}");
	add("{\"term\":\"ophidism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14535611\"]}");
	add("{\"term\":\"ophiodon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02555525\"]}");
	add("{\"term\":\"ophiodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02555368\"]}");
	add("{\"term\":\"ophioglossaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12980727\"]}");
	add("{\"term\":\"ophioglossales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12980562\"]}");
	add("{\"term\":\"ophioglossum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12980971\"]}");
	add("{\"term\":\"ophiolatry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01048716\"]}");
	add("{\"term\":\"ophiophagus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01751201\"]}");
	add("{\"term\":\"ophisaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01692980\"]}");
	add("{\"term\":\"ophiuchus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09402484\"]}");
	add("{\"term\":\"ophiurida\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02320305\"]}");
	add("{\"term\":\"ophiuroidea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02320140\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }