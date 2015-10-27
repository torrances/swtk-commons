package org.swtk.commons.dict.wordnet.index.name.instance.e.p.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceEPIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"episcia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12852692\"]}");
	add("{\"term\":\"episcleritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14369124\"]}");
	add("{\"term\":\"episcopacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07963555\"]}");
	add("{\"term\":\"episcopalian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082082\"]}");
	add("{\"term\":\"episcopalianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06198338\"]}");
	add("{\"term\":\"episcopate\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00590531\", \"07963555\", \"08568541\", \"15316950\"]}");
	add("{\"term\":\"episiotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00682167\"]}");
	add("{\"term\":\"episode\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04180233\", \"06634278\", \"06407973\", \"07304679\"]}");
	add("{\"term\":\"episome\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14841589\"]}");
	add("{\"term\":\"epispadias\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14176950\"]}");
	add("{\"term\":\"episperm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11702818\"]}");
	add("{\"term\":\"epistasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13516710\"]}");
	add("{\"term\":\"epistaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14394397\"]}");
	add("{\"term\":\"episteme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05620141\"]}");
	add("{\"term\":\"epistemologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10082192\"]}");
	add("{\"term\":\"epistemology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06176464\"]}");
	add("{\"term\":\"epistle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06454286\", \"06638690\"]}");
	add("{\"term\":\"epistrophe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07114779\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }