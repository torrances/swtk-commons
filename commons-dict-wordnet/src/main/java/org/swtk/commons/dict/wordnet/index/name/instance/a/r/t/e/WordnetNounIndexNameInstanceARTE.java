package org.swtk.commons.dict.wordnet.index.name.instance.a.r.t.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceARTE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"artefact\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00022119\"]}");
	add("{\"term\":\"artemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01997977\"]}");
	add("{\"term\":\"artemis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09579826\"]}");
	add("{\"term\":\"artemisia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11948821\"]}");
	add("{\"term\":\"arteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05341325\"]}");
	add("{\"term\":\"arteriectasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047656\"]}");
	add("{\"term\":\"arteriectasis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047656\"]}");
	add("{\"term\":\"arteriogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02747428\"]}");
	add("{\"term\":\"arteriography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00907440\"]}");
	add("{\"term\":\"arteriola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05344849\"]}");
	add("{\"term\":\"arteriole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05344849\"]}");
	add("{\"term\":\"arteriolosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14131714\"]}");
	add("{\"term\":\"arteriosclerosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14131806\"]}");
	add("{\"term\":\"arteritis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14282111\"]}");
	add("{\"term\":\"artery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02747537\", \"05341325\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }