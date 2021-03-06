package org.swtk.commons.dict.wordnet.indexbyname.instance.r.u.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceRUP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"rupee\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"13725909\", \"13726379\", \"13726748\", \"13727002\", \"13727258\", \"13727520\"]}");
	add("{\"term\":\"rupert\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11294093\"]}");
	add("{\"term\":\"rupert brooke\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10885577\"]}");
	add("{\"term\":\"rupert murdoch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11216924\"]}");
	add("{\"term\":\"rupestral plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13144778\"]}");
	add("{\"term\":\"rupestrine plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13144778\"]}");
	add("{\"term\":\"rupiah\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13727779\"]}");
	add("{\"term\":\"rupicapra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02421863\"]}");
	add("{\"term\":\"rupicapra rupicapra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02421982\"]}");
	add("{\"term\":\"rupicola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01553594\"]}");
	add("{\"term\":\"rupicola peruviana\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01553941\"]}");
	add("{\"term\":\"rupicola rupicola\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01553721\"]}");
	add("{\"term\":\"rupicolous plant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13144778\"]}");
	add("{\"term\":\"ruptiliocarpon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12722661\"]}");
	add("{\"term\":\"ruptiliocarpon caracolito\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12722884\"]}");
	add("{\"term\":\"rupture\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00377523\", \"07328414\", \"14318750\"]}");
	add("{\"term\":\"ruptured intervertebral disc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14320081\"]}");
	add("{\"term\":\"rupturewort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11831197\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }