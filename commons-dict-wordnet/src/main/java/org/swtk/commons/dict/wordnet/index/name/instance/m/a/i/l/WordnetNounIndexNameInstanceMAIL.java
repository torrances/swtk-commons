package org.swtk.commons.dict.wordnet.index.name.instance.m.a.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mail\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03003851\", \"08480074\", \"03715183\", \"06275051\", \"06286287\"]}");
	add("{\"term\":\"mailbag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03715362\", \"03715499\"]}");
	add("{\"term\":\"mailboat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03715618\"]}");
	add("{\"term\":\"mailbox\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03995432\", \"03715732\"]}");
	add("{\"term\":\"maildrop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03715960\"]}");
	add("{\"term\":\"mailer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03716067\", \"07264004\", \"10302617\", \"11169752\"]}");
	add("{\"term\":\"mailing\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00123158\", \"08480658\"]}");
	add("{\"term\":\"maillol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11169857\"]}");
	add("{\"term\":\"maillot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03716176\", \"03716260\"]}");
	add("{\"term\":\"mailman\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10302734\"]}");
	add("{\"term\":\"mailsorter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03716476\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }