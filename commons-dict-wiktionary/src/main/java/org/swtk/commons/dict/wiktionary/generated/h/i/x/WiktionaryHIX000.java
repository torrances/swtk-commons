package org.swtk.commons.dict.wiktionary.generated.h.i.x;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHIX000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hixploitation", "{\"term\":\"hixploitation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hick|sploitation|lang\u003den}}File:Farmers daughters poster.jpg|thumb|right|160px|Poster for the pornographic hixploitation film \u0027{{w|Farmer\u0027s Daughters}}\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A genre of exploitation film that relies on the stereotypical (and often negative) depiction of rural whites of the American South and Appalachia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2006\u0027\u0027, David Kamp \u0026amp; Lawrence Levi, \u0027The Film Snob*s Dictionary: An Essential Lexicon of Filmological Knowledge\u0027, Broadway Books (2006), ISBN 9780767918763, [https://books.google.com/books?id\u003dz0WY_UVe44UC\u0026amp;pg\u003dPA48\u0026amp;dq\u003d%22hixploitation%22 page 48\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The apotheosis of the \u0027\u0027hixploitation\u0027\u0027 movement was \u0027Smokey and the Bandit\u0027 (1977), the directorial debut of Tennessee-born veteran stuntman Hal Needham, who actually cast Mel Tillis, Foster Brooks, and Ruth Buzzi for unironic effect\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, Troy Patterson, \u0026quot;Chick Flicked\u0026quot;, \u0027Spin\u0027, February 2007, [https://books.google.com/books?id\u003dG-FewpAsvB0C\u0026amp;pg\u003dPA92\u0026amp;dq\u003d%22hixploitation%22 page 92\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"While \u0027Black Snake Moan\u0027 seems to unfold in a realm of synthetic fantasy—a hybrid of hip-hop\u0027s Dirty South, a bluesman\u0027s back roads, and the Dixie of \u002770s \u0027\u0027hixploitation\u0027\u0027 flicks—it\u0027s actually set in a corner of Tennessee where a white girl named Rae (Ricci) holds the title of town slut\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Tara Powell, \u0026quot;\u0027You Taste of America\u0027: \u0027Talladega Nights\u0027, \u0027Deliverance\u0027, and Southern Studies\u0026quot;, in \u0027Southerners on Film: Essays on Hollywood Portrayals Since the 1970s\u0027 (ed. Andrew B. Leiter), McFarland \u0026amp; Company (2011), ISBN 9780786487028, [https://books.google.com/books?id\u003dFp8STjflOuUC\u0026amp;pg\u003dPA220\u0026amp;dq\u003d%22hixploitation%22 page 220\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Historians of what Scott Von Doviak dubbed \u0026quot;Hick Flicks\u0026quot; in his 2005 book by that name, point out that a \u0026quot;Southern\u0026quot; genre of film never emerged to compete with the western as such for a national audience, though there was a rise of \u0027\u0027hixploitation\u0027\u0027 films in the 1970s whose success hinged on and ultimately died with the demise of the drive-in regional theater (French, Von Doviak\", \"priority\":7}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }