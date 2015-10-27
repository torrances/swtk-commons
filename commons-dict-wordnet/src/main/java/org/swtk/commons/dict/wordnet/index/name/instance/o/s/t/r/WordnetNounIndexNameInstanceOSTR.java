package org.swtk.commons.dict.wordnet.index.name.instance.o.s.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceOSTR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ostraciidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02656886\"]}");
	add("{\"term\":\"ostracism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00208283\", \"14451037\"]}");
	add("{\"term\":\"ostracod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02000479\"]}");
	add("{\"term\":\"ostracoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02000352\"]}");
	add("{\"term\":\"ostracoderm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01477505\"]}");
	add("{\"term\":\"ostracodermi\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01477282\"]}");
	add("{\"term\":\"ostrava\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08776320\"]}");
	add("{\"term\":\"ostrea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01963541\"]}");
	add("{\"term\":\"ostreidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01962942\"]}");
	add("{\"term\":\"ostrich\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01521519\", \"10405406\"]}");
	add("{\"term\":\"ostrogoth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10405622\"]}");
	add("{\"term\":\"ostrya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12307905\"]}");
	add("{\"term\":\"ostryopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12308705\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }