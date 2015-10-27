package org.swtk.commons.dict.wordnet.index.name.instance.m.o.r.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMORP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"morphallaxis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13538588\"]}");
	add("{\"term\":\"morphea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14588702\"]}");
	add("{\"term\":\"morpheme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06317223\"]}");
	add("{\"term\":\"morpheus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09522361\"]}");
	add("{\"term\":\"morphia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03791950\"]}");
	add("{\"term\":\"morphine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03791950\"]}");
	add("{\"term\":\"morphogenesis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13538756\"]}");
	add("{\"term\":\"morphology\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"06127462\", \"06187445\", \"06187758\", \"06087877\"]}");
	add("{\"term\":\"morphophoneme\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07126218\"]}");
	add("{\"term\":\"morphophonemics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06188376\"]}");
	add("{\"term\":\"morphophysiology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06069259\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }