package org.swtk.commons.dict.wordnet.index.name.instance.h.o.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHONK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"honk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07399849\"]}");
	add("{\"term\":\"honker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01860273\", \"05606462\", \"10203175\"]}");
	add("{\"term\":\"honkey\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09662401\"]}");
	add("{\"term\":\"honkie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09662401\"]}");
	add("{\"term\":\"honky\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09662401\"]}");
	add("{\"term\":\"honkytonk\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03535983\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }