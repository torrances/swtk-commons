package org.swtk.commons.dict.wordnet.index.name.instance.n.o.n.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNONC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"noncandidate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10380065\"]}");
	add("{\"term\":\"nonce\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15160386\"]}");
	add("{\"term\":\"nonchalance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04680827\"]}");
	add("{\"term\":\"noncitizen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10123254\"]}");
	add("{\"term\":\"noncom\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10380446\"]}");
	add("{\"term\":\"noncombatant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10380277\"]}");
	add("{\"term\":\"noncompliance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01182197\"]}");
	add("{\"term\":\"noncompliant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09853385\"]}");
	add("{\"term\":\"nonconductor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14845760\"]}");
	add("{\"term\":\"nonconformance\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01207335\", \"06222385\"]}");
	add("{\"term\":\"nonconformism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00419318\", \"06222385\"]}");
	add("{\"term\":\"nonconformist\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09977313\", \"09977612\"]}");
	add("{\"term\":\"nonconformity\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"01207335\", \"04808279\", \"06222385\", \"07196113\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }