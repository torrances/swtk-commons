package org.swtk.commons.dict.wordnet.index.name.instance.d.e.m.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEMI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"demiglace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07853731\"]}");
	add("{\"term\":\"demigod\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09529348\", \"10021357\"]}");
	add("{\"term\":\"demijohn\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03179116\"]}");
	add("{\"term\":\"demille\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10949850\"]}");
	add("{\"term\":\"demimondaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10021475\"]}");
	add("{\"term\":\"demimonde\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08261816\"]}");
	add("{\"term\":\"demineralisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13482728\", \"14234198\"]}");
	add("{\"term\":\"demineralization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13482728\", \"14234198\"]}");
	add("{\"term\":\"demise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15168437\"]}");
	add("{\"term\":\"demisemiquaver\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06884725\"]}");
	add("{\"term\":\"demister\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03179271\"]}");
	add("{\"term\":\"demitasse\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03179397\", \"07935905\"]}");
	add("{\"term\":\"demiurge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09561744\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }