package org.swtk.commons.dict.wordnet.index.name.instance.p.i.l.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePILL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pill\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03943171\", \"05841835\", \"10452639\", \"03942844\", \"03943040\"]}");
	add("{\"term\":\"pillage\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00967999\", \"13283562\"]}");
	add("{\"term\":\"pillager\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10462744\"]}");
	add("{\"term\":\"pillaging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00967999\"]}");
	add("{\"term\":\"pillar\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03077981\", \"03078384\", \"10452721\", \"13923115\", \"05922436\"]}");
	add("{\"term\":\"pillbox\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03943909\", \"03944027\", \"03944111\"]}");
	add("{\"term\":\"pillion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03944207\"]}");
	add("{\"term\":\"pillock\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10686626\"]}");
	add("{\"term\":\"pillory\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03944313\"]}");
	add("{\"term\":\"pillow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03944520\"]}");
	add("{\"term\":\"pillowcase\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02978871\"]}");
	add("{\"term\":\"pillwort\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12979021\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }