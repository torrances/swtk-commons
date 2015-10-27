package org.swtk.commons.dict.wordnet.index.name.instance.m.i.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMISO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"miso\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07873146\"]}");
	add("{\"term\":\"misocainea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562863\"]}");
	add("{\"term\":\"misogamist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10342204\"]}");
	add("{\"term\":\"misogamy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562361\"]}");
	add("{\"term\":\"misogynism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562452\"]}");
	add("{\"term\":\"misogynist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10342306\"]}");
	add("{\"term\":\"misogyny\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562452\"]}");
	add("{\"term\":\"misology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562685\"]}");
	add("{\"term\":\"misoneism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562759\"]}");
	add("{\"term\":\"misopedia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07562939\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }