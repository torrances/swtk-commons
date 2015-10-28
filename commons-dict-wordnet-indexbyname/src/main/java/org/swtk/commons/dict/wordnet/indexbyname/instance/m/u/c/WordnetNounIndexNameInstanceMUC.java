package org.swtk.commons.dict.wordnet.indexbyname.instance.m.u.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"much\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13798833\"]}");
	add("{\"term\":\"muchness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05106924\"]}");
	add("{\"term\":\"mucilage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14727036\", \"14925830\"]}");
	add("{\"term\":\"mucin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14755134\"]}");
	add("{\"term\":\"muck\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14878998\", \"14980800\"]}");
	add("{\"term\":\"muckheap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07978909\"]}");
	add("{\"term\":\"muckhill\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07978909\"]}");
	add("{\"term\":\"muckle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13796604\"]}");
	add("{\"term\":\"muckraker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10356250\"]}");
	add("{\"term\":\"muckraking\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07230476\"]}");
	add("{\"term\":\"mucoid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14980166\"]}");
	add("{\"term\":\"mucopolysaccharide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14980282\"]}");
	add("{\"term\":\"mucopolysaccharidosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14181009\"]}");
	add("{\"term\":\"mucor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12994203\"]}");
	add("{\"term\":\"mucoraceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12993726\"]}");
	add("{\"term\":\"mucorales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12993578\"]}");
	add("{\"term\":\"mucosa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05334682\"]}");
	add("{\"term\":\"mucoviscidosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14178988\"]}");
	add("{\"term\":\"mucuna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12570715\"]}");
	add("{\"term\":\"mucus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05422738\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }