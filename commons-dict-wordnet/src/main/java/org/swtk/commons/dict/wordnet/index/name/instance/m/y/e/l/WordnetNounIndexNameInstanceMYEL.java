package org.swtk.commons.dict.wordnet.index.name.instance.m.y.e.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYEL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"myelatelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14373511\"]}");
	add("{\"term\":\"myelencephalon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05508463\"]}");
	add("{\"term\":\"myelin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14982032\"]}");
	add("{\"term\":\"myeline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14982032\"]}");
	add("{\"term\":\"myelinisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13539635\"]}");
	add("{\"term\":\"myelinization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13539635\"]}");
	add("{\"term\":\"myelitis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14373611\"]}");
	add("{\"term\":\"myeloblast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05456280\"]}");
	add("{\"term\":\"myelocyte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05456173\"]}");
	add("{\"term\":\"myelofibrosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14231460\"]}");
	add("{\"term\":\"myelogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03809320\"]}");
	add("{\"term\":\"myelography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00908168\"]}");
	add("{\"term\":\"myeloma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14271738\"]}");
	add("{\"term\":\"myelomeningocele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14490979\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }