package org.swtk.commons.dict.wordnet.indexbyname.instance.k.i.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceKIL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"kildeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026646\"]}");
	add("{\"term\":\"kilderkin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13644195\"]}");
	add("{\"term\":\"kiley\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03634692\"]}");
	add("{\"term\":\"kilimanjaro\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09348869\"]}");
	add("{\"term\":\"kiliwa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935742\", \"09678893\"]}");
	add("{\"term\":\"kiliwi\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06935742\", \"09678893\"]}");
	add("{\"term\":\"kill\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01325752\", \"00218460\", \"00219879\"]}");
	add("{\"term\":\"kill zone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08708090\"]}");
	add("{\"term\":\"killarney fern\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12973350\"]}");
	add("{\"term\":\"killdeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026646\"]}");
	add("{\"term\":\"killdeer plover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02026646\"]}");
	add("{\"term\":\"killer\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02073946\", \"05696435\", \"14564166\", \"10250784\"]}");
	add("{\"term\":\"killer bee\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02211150\", \"10251058\"]}");
	add("{\"term\":\"killer cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05460092\"]}");
	add("{\"term\":\"killer t cell\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05460092\"]}");
	add("{\"term\":\"killer whale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02073946\"]}");
	add("{\"term\":\"killifish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01449401\"]}");
	add("{\"term\":\"killing\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13280696\", \"00219879\", \"07376176\"]}");
	add("{\"term\":\"killing field\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08708217\"]}");
	add("{\"term\":\"killing zone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08708090\"]}");
	add("{\"term\":\"killjoy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10657534\"]}");
	add("{\"term\":\"kiln\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03622304\"]}");
	add("{\"term\":\"kilo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13746692\"]}");
	add("{\"term\":\"kilobit\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13649271\"]}");
	add("{\"term\":\"kilobyte\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13648977\", \"13649142\"]}");
	add("{\"term\":\"kilocalorie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13748672\"]}");
	add("{\"term\":\"kilocycle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304776\"]}");
	add("{\"term\":\"kilocycle per second\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304776\"]}");
	add("{\"term\":\"kilogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13746692\"]}");
	add("{\"term\":\"kilogram calorie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13748672\"]}");
	add("{\"term\":\"kilohertz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304776\"]}");
	add("{\"term\":\"kiloliter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646268\"]}");
	add("{\"term\":\"kilolitre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13646268\"]}");
	add("{\"term\":\"kilometer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681796\"]}");
	add("{\"term\":\"kilometers per hour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304947\"]}");
	add("{\"term\":\"kilometre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13681796\"]}");
	add("{\"term\":\"kilometres per hour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15304947\"]}");
	add("{\"term\":\"kiloton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13668833\", \"13743800\"]}");
	add("{\"term\":\"kilovolt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13665249\"]}");
	add("{\"term\":\"kilowatt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13666240\"]}");
	add("{\"term\":\"kilowatt hour\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13749588\"]}");
	add("{\"term\":\"kilroy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09624075\"]}");
	add("{\"term\":\"kilt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03622521\"]}");
	add("{\"term\":\"kilter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14520704\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }