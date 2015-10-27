package org.swtk.commons.dict.wordnet.index.name.instance.c.r.e.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCRED {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cred\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04791753\"]}");
	add("{\"term\":\"credence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03134404\", \"06203462\"]}");
	add("{\"term\":\"credendum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06281343\"]}");
	add("{\"term\":\"credential\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06483016\"]}");
	add("{\"term\":\"credentials\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06483016\"]}");
	add("{\"term\":\"credenza\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03134404\"]}");
	add("{\"term\":\"credibility\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04790142\"]}");
	add("{\"term\":\"credibleness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04790142\"]}");
	add("{\"term\":\"credit\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"05811755\", \"06358051\", \"06776392\", \"00066675\", \"13395454\", \"00037921\", \"13426819\", \"13399691\", \"06701019\"]}");
	add("{\"term\":\"creditor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09996258\"]}");
	add("{\"term\":\"credits\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06501959\"]}");
	add("{\"term\":\"creditworthiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04676420\"]}");
	add("{\"term\":\"credo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05968821\"]}");
	add("{\"term\":\"credulity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04902753\"]}");
	add("{\"term\":\"credulousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04888351\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }