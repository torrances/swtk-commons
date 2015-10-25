package org.swtk.commons.dict.wiktionary.generated.e.t.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryETI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("etifoxine", "{\"term\":\"etifoxine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An anxiolytic and anticonvulsant drug\", \"priority\":1}]}, \"synonyms\":{}}");

	add("etiopathogenesis", "{\"term\":\"etiopathogenesis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From \u0027etiology\u0027 + \u0027pathogenesis\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The cause and subsequent development of an abnormal condition or of a disease\", \"priority\":1}]}, \"synonyms\":{}}");

	add("etiquette", "{\"term\":\"etiquette\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"old english (ca. 450-1100)\", \"German\", \"English\", \"French\", \"frankish\", \"middle french (ca. 1400-1600)\", \"old french (842-ca. 1400)\", \"old high german (ca. 750-1050)\", \"picard\"], \"text\":\"1740, from French {{m|fr|étiquette||property, a little piece of paper, or a mark or title, affixed to a bag or bundle, expressing its contents, a label, ticket}}, from Middle french (ca. 1400-1600) \u0027estiquette\u0027 (ticket, memorandum) from the Old french (842-ca. 1400) verb \u0027estechier\u0027 (compare Picard \u0027estiquier\u0027 (to stick, pierce) , from Frankish {{m|frk|*stikkan}}, {{m|frk|*stikjan||to stick, pierce, sting}}, from Proto-germanic {{m|gem-pro|*stikaną}}, {{m|gem-pro|*stikōną}}, {{m|gem-pro|*staikijaną||to be sharp, pierce, prick}}, from Proto-indo-european {{m|ine-pro|*st(e)ig-}}, {{m|ine-pro|*(s)teig-||to be sharp, to stab}}. Akin to Old high german (ca. 750-1050) \u0027stehhan\u0027 (to stick, attach, nail) (German \u0027stechen\u0027 (to stick) , Old english (ca. 450-1100) \u0027stician\u0027 (to pierce, stab, be fastened) The French Court of w:Louis XIV|Louis XIV at w:Versailles|Versailles used \u0027étiquettes\u0027, \u0026quot;little cards\u0026quot;, to remind courtiers to keep off of the grass and similar rules. More at stick|stick {{qualifier|verb}}, stitch.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"File:Thailand Post — Imprinted airmail etiquette EN TH thumb|A Thai airmail \u0027\u0027etiquette\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The forms required by good breeding, or prescribed by authority, to be observed in social or official life; observance of the proprieties of rank and occasion; conventional decorum; ceremonial code of polite society\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The customary behavior of members of a profession, business, law, or sports team towards each other.\u0026lt;!-- b The unwritten code governing this(medical Etiquette) Is this distinct from both of the previous definitions, or should it be integrated into one of them? I\u0027d say it is the same: IWTHG :) --\u0026gt\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, July 15. Richard Williams in Guardian Unlimited, [http://www.guardian.co.uk/sport/2012/jul/15/tour-de-france-2012-bradley-wiggins Tour de France 2012: Carpet tacks cannot force Bradley Wiggins off track\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Cycling\u0027s complex \u0027\u0027etiquette\u0027\u0027 contains an unwritten rule that riders in contention for a race win should not be penalised for sheer misfortune\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A label used to indicate that a letter is to be sent by airmail\", \"priority\":6}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }