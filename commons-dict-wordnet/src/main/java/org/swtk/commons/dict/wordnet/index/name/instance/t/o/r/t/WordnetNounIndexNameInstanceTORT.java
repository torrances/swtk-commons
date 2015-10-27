package org.swtk.commons.dict.wordnet.index.name.instance.t.o.r.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTORT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00735181\"]}");
	add("{\"term\":\"torte\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07649120\"]}");
	add("{\"term\":\"tortellini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07715912\"]}");
	add("{\"term\":\"tortfeasor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10735935\"]}");
	add("{\"term\":\"torticollis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14581311\"]}");
	add("{\"term\":\"tortilla\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07896558\"]}");
	add("{\"term\":\"tortoise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01672733\"]}");
	add("{\"term\":\"tortoiseshell\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"02125894\", \"02278425\", \"14782599\"]}");
	add("{\"term\":\"tortricid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02286603\"]}");
	add("{\"term\":\"tortricidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02286380\"]}");
	add("{\"term\":\"tortrix\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02287263\", \"02287536\"]}");
	add("{\"term\":\"tortuosity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13908063\"]}");
	add("{\"term\":\"tortuousness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04773875\", \"13908063\"]}");
	add("{\"term\":\"torture\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00422440\", \"00752872\", \"07510691\", \"14356838\", \"07511895\"]}");
	add("{\"term\":\"torturer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10736038\"]}");
	add("{\"term\":\"torturing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00422440\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }